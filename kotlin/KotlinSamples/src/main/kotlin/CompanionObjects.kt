package br.com.matheuspsantos

interface IFactory<T> {
    fun create(): T
}

class PointV2(var x: Double, var y: Double) {
    //    companion object Factory {
    companion object : IFactory<PointV2> {
        override fun create(): PointV2 {
            return PointV2(0.0, 0.0)
        }

        fun createCartesian(x: Double, y: Double): PointV2 = PointV2(x, y)
        fun createPolar(x: Double, y: Double): PointV2 = PointV2(x, y)
    }
}

class CompanionObjects {
}