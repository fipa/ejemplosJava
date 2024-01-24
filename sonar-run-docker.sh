docker run \
    --rm \
    -e SONAR_HOST_URL="http://172.17.0.2:9000" \
    -e SONAR_SCANNER_OPTS="-Dsonar.projectKey=EjemplosJava" \
    -e SONAR_TOKEN="sqp_fcefe921a24bf4d09924f6cda82d3647323f2333" \
    -v "src:/usr/src" \
    sonarsource/sonar-scanner-cli
