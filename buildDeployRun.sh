JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
mvn clean install
cp ./EARmodule/target/EARmodule-1.0-SNAPSHOT.ear ./wildfly-24.0.0.Final/standalone/deployments/
./wildfly-24.0.0.Final/bin/standalone.sh
