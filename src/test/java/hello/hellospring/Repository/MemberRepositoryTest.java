package hello.hellospring.Repository;

import hello.hellospring.domain.Member;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Rollback(false)
class MemberRepositoryTest {
    @Autowired
    MemoryMemberRepository memoryMemberRepository;

    @Test
    @Transactional
    public void testMember() throws Exception {

        Member member = new Member();
        member.setName("memberA");

        Member member1 = memoryMemberRepository.save(member);
//        Member findMember = memoryMemberRepository.find(saveId);


//        Assertions.assertThat(findMember.getId()).isEqualTo(member.getId());
//        Assertions.assertThat(findMember.getName()).isEqualTo(member.getName());
    }
}