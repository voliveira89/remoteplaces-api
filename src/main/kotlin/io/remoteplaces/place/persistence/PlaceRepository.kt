package io.remoteplaces.place.persistence

import io.remoteplaces.place.domain.Place
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PlaceRepository : JpaRepository<Place, Long>