package kr.skeleton.skeletonapi.domain.notice.controller

import kr.skeleton.skeletonapi.domain.notice.payload.CreateNoticeApiRequest
import kr.skeleton.skeletondomain.usecase.notice.CreateNoticeRequest
import kr.skeleton.skeletondomain.usecase.notice.CreateNoticeUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class NoticeController(
	private val createNoticeUseCase: CreateNoticeUseCase,
) {
	@PostMapping("/api/notices")
	fun createNotice(
		@RequestBody request: CreateNoticeApiRequest,
	) {
		createNoticeUseCase.create(
			CreateNoticeRequest(
				title = request.title,
				content = request.contents,
			),
		)
	}
}
