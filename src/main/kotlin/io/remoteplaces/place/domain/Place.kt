package io.remoteplaces.place.domain

import java.io.Serializable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "t_place")
data class Place(
        @Id @GeneratedValue
        var id: Long? = null,
        var name: String
) : Serializable