package com.ndt.sms.db;

import org.jooq.util.GenerationTool;
import org.jooq.util.jaxb.*;


public class JooqPgGenerator {

    /**
     * Jooq 自动化生成代码
     */
    private void gen() {
        Jdbc jdbc = new Jdbc().withDriver("org.postgresql.Driver")
                .withUrl("jdbc:postgresql://127.0.0.1:5432/ndt_pro?searchpath=ndt")
                .withUser("root")
                .withPassword("123456");
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
