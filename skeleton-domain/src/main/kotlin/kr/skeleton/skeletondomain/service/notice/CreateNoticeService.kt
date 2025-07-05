package kr.skeleton.skeletondomain.service.notice

import kr.skeleton.skeletondomain.domain.notice.Notice
import kr.skeleton.skeletondomain.domain.notice.NoticeRepository
import kr.skeleton.skeletondomain.usecase.notice.CreateNoticeRequest
import kr.skeleton.skeletondomain.usecase.notice.CreateNoticeUseCase
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CreateNoticeService(
	private val noticeRepository: NoticeRepository,
): CreateNoticeUseCase {

	@Transactional
	override fun create(request: CreateNoticeRequest) {
		val notice = Notice(
			title = request.title,
			content = request.content,
		)
		noticeRepository.save(notice)
	}
}
