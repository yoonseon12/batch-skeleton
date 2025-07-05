package kr.skeleton.skeletondomain.domain.notice

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport
import org.springframework.stereotype.Repository

@Repository
class NoticeJpaRepository: QuerydslRepositorySupport(Notice::class.java), NoticeRepository {
	override fun save(notice: Notice) {
		entityManager!!.persist(notice)
	}
}
