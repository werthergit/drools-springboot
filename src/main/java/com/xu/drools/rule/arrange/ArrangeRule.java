package com.xu.drools.rule.arrange;

import com.xu.drools.bean.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * 使用kmodule的方式调用drools
 * /resources/META-INF/kmodule.xml
 */
public class ArrangeRule {
    public static void main(final String[] args) {
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        System.out.println(kc.verify().getMessages().toString());
        execute(kc);
    }

    private static void execute(KieContainer kc) {
        KieSession ksession = kc.newKieSession("arrangeKS");

        Employee employee1 = new Employee();
        employee1.setName("li");

        Employee employee2 = new Employee();
        employee2.setName("si");


        ksession.insert(employee1);
        ksession.insert(employee2);

        ksession.fireAllRules();

        ksession.dispose();

        System.out.println("emp1:"+employee1.getWeek());
        System.out.println("emp2:"+employee2.getWeek());
    }
}
