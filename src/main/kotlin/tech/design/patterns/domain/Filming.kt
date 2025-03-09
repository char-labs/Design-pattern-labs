package tech.design.patterns.domain

import java.time.LocalDateTime

data class Filming (
    val id: Long? = 0,
    val seconds: Long,
    val algorithm: FilmingAlgorithm,
    val frameUrl: String,
    val lastCapturedAt: LocalDateTime,
)

// Filming 더미 데이터 생성
object FilmingDummyData {
    val filmingData = listOf(
        Filming(
            id = 1,
            seconds = 10,
            algorithm = FilmingAlgorithm.SCENE,
            frameUrl = "https://tech.design.patterns/scene/1",
            lastCapturedAt = LocalDateTime.now()
        ),
        Filming(
            id = 2,
            seconds = 20,
            algorithm = FilmingAlgorithm.ACTION,
            frameUrl = "https://tech.design.patterns/action/2",
                lastCapturedAt = LocalDateTime.now()
        ),
        Filming(
            id = 3,
            seconds = 30,
                algorithm = FilmingAlgorithm.FACE,
            frameUrl = "https://tech.design.patterns/face/3",
            lastCapturedAt = LocalDateTime.now()
        ),
        Filming(
            id = 4,
            seconds = 10,
            algorithm = FilmingAlgorithm.SCENE,
            frameUrl = "https://tech.design.patterns/scene/4",
            lastCapturedAt = LocalDateTime.now(),
        ),
        Filming(
            id = 5,
            seconds = 20,
            algorithm = FilmingAlgorithm.ACTION,
            frameUrl = "https://tech.design.patterns/action/5",
            lastCapturedAt = LocalDateTime.now(),
        ),
        Filming(
            id = 6,
            seconds = 30,
            algorithm = FilmingAlgorithm.FACE,
            frameUrl = "https://tech.design.patterns/face/6",
            lastCapturedAt = LocalDateTime.now(),
        )
    )
}
