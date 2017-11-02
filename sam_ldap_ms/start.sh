eval $(docker-machine env rancher-node2)
mvn -f pom.xml package
docker-compose build
docker-compose up
