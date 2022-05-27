package de.reservationbear.eist.db.services

import de.reservationbear.eist.db.entities.Comment
import de.reservationbear.eist.db.repositories.CommentRepository
import org.springframework.stereotype.Service

@Service
class CommentService(val db: CommentRepository) {

    fun findComments(): List<Comment> = db.findAll()

    fun post(message: Comment) {
        db.save(message)
    }
}