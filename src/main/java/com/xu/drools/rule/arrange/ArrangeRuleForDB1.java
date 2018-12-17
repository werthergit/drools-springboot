package com.xu.drools.rule.arrange;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * 使用kmodule的方式调用drools
 * /resources/META-INF/kmodule.xml
 */
public class ArrangeRuleForDB1 {
    public static void main(final String[] args) {
        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        System.out.println(kc.verify().getMessages().toString());
        execute(kc);
    }

    private static void execute(KieContainer kc) {
        KieSession ksession = kc.newKieSession("arrangeForDB1KS");

        Employee employee1 = new Employee();
        employee1.setGroup("g1");
        employee1.setOrder(1);
        employee1.setName("lisa");


        Employee employee2 = new Employee();
        employee2.setGroup("g1");
        employee2.setOrder(2);
        employee2.setName("rose");

        Employee employee3 = new Employee();
        employee3.setGroup("g1");
        employee3.setOrder(3);
        employee3.setName("rose3");

        Employee employee4 = new Employee();
        employee4.setGroup("g1");
        employee4.setOrder(4);
        employee4.setName("rose4");

        Employee employee5 = new Employee();
        employee5.setGroup("g1");
        employee5.setOrder(5);
        employee5.setName("jack");


        ksession.insert(employee1);
        ksession.insert(employee2);
        ksession.insert(employee3);
        ksession.insert(employee4);
        ksession.insert(employee5);

        ksession.fireAllRules();

        ksession.dispose();

        System.out.println("emp1:"+employee1.getArrangeJson());
        System.out.println("");
        System.out.println("emp2:"+employee2.getArrangeJson());
        System.out.println("");
        System.out.println("emp3:"+employee3.getArrangeJson());
        System.out.println("");
        System.out.println("emp4:"+employee4.getArrangeJson());
        System.out.println("");
        System.out.println("emp5:"+employee5.getArrangeJson());
    }
}
