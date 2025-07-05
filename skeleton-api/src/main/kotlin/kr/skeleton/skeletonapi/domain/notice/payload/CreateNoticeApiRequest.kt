package kr.skeleton.skeletonapi.domain.notice.payload

data class CreateNoticeApiRequest(
	val title: String,
	val contents: String,
)
