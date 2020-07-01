./mvnw clean package -Pnative  -Dquarkus.native.container-build=true -Dquarkus.native.container-runtime=docker
docker rmi quay.io/qiot/qiot-datahub-streamer-pollution
docker build -f src/main/docker/Dockerfile.native -t quay.io/qiot/qiot-datahub-streamer-pollution .
docker push quay.io/qiot/qiot-datahub-streamer-pollution