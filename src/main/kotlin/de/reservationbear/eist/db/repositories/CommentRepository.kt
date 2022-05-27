package de.reservationbear.eist.db.repositories

import de.reservationbear.eist.db.entities.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*


@Repository
interface CommentRepository : JpaRepository<Comment, UUID>