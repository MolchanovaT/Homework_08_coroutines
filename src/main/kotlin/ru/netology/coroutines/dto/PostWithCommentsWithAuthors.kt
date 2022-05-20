package ru.netology.coroutines.dto

data class PostWithCommentsWithAuthors(
    val post: PostWithAuthor,
    val comments: List<CommentWithAuthor>,
)