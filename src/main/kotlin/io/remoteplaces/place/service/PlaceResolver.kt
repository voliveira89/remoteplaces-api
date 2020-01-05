package io.remoteplaces.place.service

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import io.remoteplaces.place.domain.Place
import io.remoteplaces.place.persistence.PlaceRepository
import org.springframework.stereotype.Service

@Service
class PlaceResolver(val placeRepository: PlaceRepository) : GraphQLQueryResolver {

    fun places(): List<Place> {
        return placeRepository.findAll()
    }
}