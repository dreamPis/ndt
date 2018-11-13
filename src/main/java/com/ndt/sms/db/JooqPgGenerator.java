package com.ndt.sms.db;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.*;


public class JooqPgGenerator {

    /**
     * Jooq 自动化生成代码
     */
    private void gen() {
        Jdbc jdbc = new Jdbc().withDriver("com.p6spy.engine.spy.P6SpyDriver")
                .withUrl("jdbc:p6spy:postgresql://192.168.15.12:58083/ndt_pro?searchpath=ndt")
                .withUser("postgres")
                .withPassword("incitedata");
        Database database = new Database()
                .withName("org.jooq.util.postgres.PostgresDatabase")
                .withExcludes("schema_version")
                .withSchemata(new Schema().withInputSchema("ndt"));
        Generator generator = new Generator()
                .withName("com.ndt.sms.db.MyJavaGenerator")
                .withDatabase(database)
                .withGenerate(new Generate().withPojos(true).withFluentSetters(true).withGeneratedAnnotation(true))
                .withStrategy(new Strategy().withName("com.ndt.sms.db.MyPrefixGeneratorStrategy"))
                .withTarget(new Target()
                        .withPackageName("com.ndt.sms.entity")
                        .withDirectory("src/main/java/"));
        Configuration conf = new Configuration()
                .withJdbc(jdbc)
                .withGenerator(generator);

        try {
            GenerationTool.generate(conf);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        JooqPgGenerator jg = new JooqPgGenerator();
        jg.gen();
        System.out.println("JooqPgGenerator finished.");
    }

}
