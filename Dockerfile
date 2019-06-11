FROM payara/server-full
USER payara

COPY /target/sop.war $DEPLOY_DIR