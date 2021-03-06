package com.xu.drools.rule.arrange;

import com.xu.drools.bean.Person;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.util.ArrayList;

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
        employee1.setGroup("g1");
        employee1.setOrder(1);
        employee1.setName("lisa");


        Employee employee2 = new Employee();
        employee2.setGroup("g1");
        employee2.setOrder(2);
        employee2.setName("rose");


        ksession.insert(employee1);
        ksession.insert(employee2);

        ksession.fireAllRules();

        ksession.dispose();

        System.out.println("emp1:"+employee1.getArrangeJson());
        System.out.println("emp2:"+employee2.getArrangeJson());
    }
}
