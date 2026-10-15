# 25-java-monorepo-polyglot
Monorepo with NO build file at the repo root. Each project is self-contained in a subfolder:

    apps/inventory-service   Maven  (pom.xml)        runnable: com.octiq.test.inventory.Main
    apps/billing-service     Gradle (build.gradle)   runnable: com.octiq.test.billing.Main
    libs/common-utils        Maven  (pom.xml)        library, NO main
    web/dashboard            Node   (package.json)   frontend placeholder
    scripts/dev.sh           helper script

Expected: Octiq must either detect/list the sub-projects or report clearly that no root build file exists.
