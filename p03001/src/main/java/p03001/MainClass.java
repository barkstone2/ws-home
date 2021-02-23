package p03001;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		GlobalFood food = ctx.getBean("gFood", GlobalFood.class);
		
		food.makeFood(ctx.getBean("kFood", KoreaFood.class));
		food.makeFood(ctx.getBean("cFood", ChinaFood.class));
		
		ctx.close();
	}

}
