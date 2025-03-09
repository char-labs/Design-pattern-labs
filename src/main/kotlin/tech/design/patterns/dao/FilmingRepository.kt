package tech.design.patterns.dao

import org.springframework.stereotype.Component
import tech.design.patterns.domain.Filming
import tech.design.patterns.domain.FilmingAlgorithm
import tech.design.patterns.domain.FilmingDummyData

@Component
class FilmingRepository {
    fun findAllById(filmingAlgorithm: FilmingAlgorithm): List<Filming> =
        FilmingDummyData.filmingData.filter { it.algorithm == filmingAlgorithm }
}