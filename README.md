# CI_CID

## Sample CI_CD flow
1. Push the code
2. Jar will be build using command `mvn -T 1C -B package --file pom.xml`
3. Built jar will be pushed to docker repository using github action `docker/build-push-action@v5`
4. Secrets will be picked from Github Secrets (Repo -> Setting -> Secrets)


### Point to note
1. Few changes required in Docker file as build jar is in different location of github machine at `COPY /home/runner/work/CI_CD/CI_CD/target/archive-tmp/*.jar`
2. Docker image has command will run Main.class  