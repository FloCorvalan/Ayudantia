FROM openjdk:15.0.1-oracle

COPY /out/artifacts/demo_jar/demo.jar demo.jar

COPY docker-entrypoint.sh /

RUN chmod +x docker-entrypoint.sh

ENTRYPOINT ["bash", "docker-entrypoint.sh"]

EXPOSE 30000