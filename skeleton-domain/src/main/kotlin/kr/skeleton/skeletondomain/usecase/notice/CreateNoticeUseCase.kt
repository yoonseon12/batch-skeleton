package kr.skeleton.skeletondomain.usecase.notice

interface CreateNoticeUseCase {
	fun create(request: CreateNoticeRequest)
}

data class CreateNoticeRequest(
	val title: String,
	val content: String,
)
