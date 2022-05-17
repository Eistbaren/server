package de.reservationbear.eist

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.RequestBuilder
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

@ExtendWith(SpringExtension::class)
@WebMvcTest(HelloController::class)
@ContextConfiguration(classes = [HelloController::class])
internal class HelloControllerTest {
    @Autowired
    private val mockMvc: MockMvc? = null
    @Test
    @Throws(Exception::class)
    fun testSayHello() {
        val requestBuilder: RequestBuilder = MockMvcRequestBuilders.get("/sayHello/")
        val result = mockMvc!!.perform(requestBuilder).andReturn().response.contentAsString
        Assertions.assertEquals("Hello World!", result)
    }
}