package com.api.dataforge.repository;

import com.api.dataforge.entity.PropertyDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PropertyRepository extends MongoRepository<PropertyDocument, String> {

    // Custom query methods can be defined here if needed
    // For example, to find properties by a specific field:
    // List<PropertyDocument> findBySomeField(String someField);
}
