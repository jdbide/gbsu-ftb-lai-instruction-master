package com.kata.gbsuftblai

import com.kata.gbsuftblai.services.GbsuFtbLaiService
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.junit.MockitoJUnitRunner
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GbsuFtbLaiApplicationTests @Autowired constructor(
        val gbsuFtbLaiService: GbsuFtbLaiService
) {

   @Test
    fun contextLoads() {
    }

    @Test
    fun `1 should return 1`() {
        assertThat(gbsuFtbLaiService.convertNumber(1)).isEqualTo("1")
    }

    @Test
    fun `3 should return GbsuGbsu`() {
        assertThat(gbsuFtbLaiService.convertNumber(3)).isEqualTo("GbsuGbsu")
    }

    @Test
    fun `5 should return FtbFtb`() {
        assertThat(gbsuFtbLaiService.convertNumber(5)).isEqualTo("FtbFtb")
    }

    @Test
    fun `7 should return Lai`() {
        assertThat(gbsuFtbLaiService.convertNumber(7)).isEqualTo("Lai")
    }

    @Test
    fun `9 should return Gbsu`() {
        assertThat(gbsuFtbLaiService.convertNumber(9)).isEqualTo("Gbsu")
    }

    @Test
    fun `51 should return GbsuFtb`() {
        assertThat(gbsuFtbLaiService.convertNumber(51)).isEqualTo("GbsuFtb")
    }

    @Test
    fun `53 should return GbsuFtb`() {
        assertThat(gbsuFtbLaiService.convertNumber(53)).isEqualTo("GbsuFtb")
    }

    @Test
    fun `33 should return GbsuGbsuGbsu`() {
        assertThat(gbsuFtbLaiService.convertNumber(33)).isEqualTo("GbsuGbsuGbsu")
    }

    @Test
    fun `27 should return GbsuLai`() {
        assertThat(gbsuFtbLaiService.convertNumber(27)).isEqualTo("GbsuLai")
    }

    @Test
    fun `15 should return GbsuFtbFtb`() {
        assertThat(gbsuFtbLaiService.convertNumber(15)).isEqualTo("GbsuFtbFtb")
    }

}
