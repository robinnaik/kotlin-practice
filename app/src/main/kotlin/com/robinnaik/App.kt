/*
 * This source file was generated by the Gradle 'init' task
 */
package com.robinnaik

import io.vertx.core.Vertx

fun main() {
    val vertx: Vertx = Vertx.vertx()
    vertx.deployVerticle(MainVerticle())
}
