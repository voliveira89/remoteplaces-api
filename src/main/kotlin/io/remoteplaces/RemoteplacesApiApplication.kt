package io.remoteplaces.remoteplacesapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RemoteplacesApiApplication

fun main(args: Array<String>) {
	runApplication<RemoteplacesApiApplication>(*args)
}
