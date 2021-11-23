package com.redhat.mercury.customeroffer.services.impl;

import java.net.URI;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bian.protobuf.customeroffer.CustomerOfferNotification;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.eclipse.microprofile.reactive.messaging.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.Empty;
import com.redhat.mercury.customeroffer.CustomerOffer;
import com.redhat.mercury.customeroffer.services.CustomerOfferNotificationService;

import io.smallrye.mutiny.Uni;
import io.smallrye.reactive.messaging.annotations.Broadcast;
import io.smallrye.reactive.messaging.ce.OutgoingCloudEventMetadata;

@ApplicationScoped
public class CustomerOfferNotificationServiceImpl extends CustomerOfferNotificationService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerOfferNotificationServiceImpl.class);

    @Inject
    @Channel(CustomerOffer.DOMAIN_NAME)
    @Broadcast
    Emitter<com.google.protobuf.Message> emitter;

    @Override
    public Uni<Empty> onCustomerOfferInitiated(CustomerOfferNotification notification) {
        return Uni.createFrom().nullItem().onItem().transform(o -> {
            emitter.send(onCustomerOfferEvent(
                    notification,
                    CustomerOffer.CUSTOMER_OFFER_PROCEDURE_INITIATED_TYPE));
            return Empty.getDefaultInstance();
        });
    }

    @Override
    public Uni<Empty> onCustomerOfferCompleted(CustomerOfferNotification notification) {
        return Uni.createFrom().nullItem().onItem().transform(o -> {
            emitter.send(onCustomerOfferEvent(
                    notification,
                    CustomerOffer.CUSTOMER_OFFER_PROCEDURE_COMPLETED_TYPE));
            return Empty.getDefaultInstance();
        });
    }

    private Message<? extends com.google.protobuf.Message> onCustomerOfferEvent(CustomerOfferNotification notification, String eventType) {
        LOGGER.info("Notify CustomerOffer type: {} - Event: {}", eventType, notification);
        return Message.of(notification)
                .addMetadata(OutgoingCloudEventMetadata.builder()
                        .withSource(URI.create(CustomerOffer.DOMAIN_NAME))
                        .withType(eventType)
                        .build());
    }
}
