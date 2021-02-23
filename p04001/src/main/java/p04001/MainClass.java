package p04001;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
//		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
//		
//		GlobalFood food = ctx.getBean("gFood", GlobalFood.class);
//		
//		food.makeFood(ctx.getBean("kFood", KoreaFood.class));
//		food.makeFood(ctx.getBean("cFood", ChinaFood.class));
//		
//		ctx.close();
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(FoodConf.class);
		
		GlobalFood food = ctx.getBean("gFood", GlobalFood.class);
		
		food.makeFood(ctx.getBean("kFood", KoreaFood.class));
		food.makeFood(ctx.getBean("cFood",ChinaFood.class));
		
		
	}

}
