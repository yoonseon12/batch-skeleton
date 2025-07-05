package kr.skeleton.skeletondomain.domain.notice

import jakarta.persistence.*
import kr.skeleton.skeletondomain.BaseEntity
import org.hibernate.annotations.Comment

@Entity
@Table(name = "notice")
class Notice(

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long? = null,

	@Comment("제목")
	@Column(name = "title", length = 100, nullable = false)
	var title: String,

	@Comment("내용")
	@Column(name = "content", nullable = false)
	var content: String,
): BaseEntity()
