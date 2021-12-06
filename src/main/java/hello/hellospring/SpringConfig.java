package hello.hellospring;

import hello.hellospring.Repository.*;
import hello.hellospring.Repository.JdbcMemberRepository;
import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
//    private final DataSource dataSource;
//    private final EntityManager em;

    private final MemberRepository memberRepository;
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository);
    }

//    @Bean
//    public TimeTraceAop timeTraceAop(){
//        return  new TimeTraceAop();
//    }
//    public SpringConfig(DataSource dataSource, EntityManager em) {
//        this.dataSource = dataSource;
//        this.em = em;
//    }

//    @Bean
//    public MemberService memberService(){
//        return new MemberService(memberRepository());
//    }
//    @Bean
//    public MemberRepository memberRepository(){
////        return new MemoryMemberRepository();
////        return new JdbcMemberRepository(dataSource);
////        return new JdbcTemplateMemberRepository(dataSource);
//            return new JpaMemberRepository(em);
//        }

    }
