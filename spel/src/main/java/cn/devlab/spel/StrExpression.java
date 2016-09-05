package cn.devlab.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import java.util.GregorianCalendar;

/**
 * Created by zhong on 8/29/16.
 */
public class StrExpression {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("'Hello World'");

        String message = (String) expression.getValue();
        System.out.println(message);


         expression = parser.parseExpression("'Hello World'.concat('!')");
         message = (String) expression.getValue();
        System.out.println(message);

        expression = parser.parseExpression("'Hello World'.bytes.length");
        int length  = (Integer) expression.getValue();
        System.out.println(length);


        expression = parser.parseExpression("new String('hello world').toUpperCase()");
         message = expression.getValue(String.class);
        System.out.println(message);


        GregorianCalendar c = new GregorianCalendar();
        c.set(1856, 7, 9);

        Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");

        expression = parser.parseExpression("name");
        EvaluationContext context = new StandardEvaluationContext(tesla);
        String name =  (String) expression.getValue(context);
        System.out.println(name);


        parser.parseExpression("name == 'Nikola Tesla'");
        boolean result = expression.getValue(context, Boolean.class);
        System.out.println(result);

    }
}
