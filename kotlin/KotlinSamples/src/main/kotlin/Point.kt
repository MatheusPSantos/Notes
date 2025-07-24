package br.com.matheuspsantos

class Point(var x: Double, var y: Double) {
}

object PointFactory {
    fun NewCartesianPoint(x: Double, y: Double): Point {
        return Point(x, y)
    }

    fun NewPolarPoint(rho: Double, theta: Double): Point {
        return Point(rho * Math.cos(theta), rho * Math.sin(theta))
    }
}