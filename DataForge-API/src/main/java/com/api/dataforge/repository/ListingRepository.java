package com.api.dataforge.repository;

import com.api.dataforge.entity.ListingDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ListingRepository extends MongoRepository<ListingDocument, String> {


    Optional<ListingDocument> findByListingId(String listingId);


}
