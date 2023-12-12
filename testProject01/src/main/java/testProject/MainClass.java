package testProject;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        // 스프링을 사용하지 않은 순수 자바의 new키워드를 이용한 객체생성
//        TranspotationWalk transpotationWalk = new TranspotationWalk();
//        transpotationWalk.move();

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
        TranspotationWalk tWalk = ctx.getBean("tWalk", TranspotationWalk.class);
        tWalk.move();
        ctx.close();
    }
}
