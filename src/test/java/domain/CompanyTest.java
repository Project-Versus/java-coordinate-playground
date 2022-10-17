package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CompanyTest {

    @DisplayName("회사 객체 생성")
    @Test
    void 회사_객체_생성() {
        Company company = new CarCompany();

        assertThat(company).isInstanceOf(Company.class);
    }

    @DisplayName("회사 report 테스트")
    @Test
    void 리포트_생성_테스트() {

    }

}