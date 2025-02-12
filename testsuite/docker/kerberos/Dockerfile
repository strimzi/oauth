FROM ubuntu:22.04

RUN DEBIAN_FRONTEND=noninteractive apt-get update -y && apt-get install -y krb5-kdc krb5-admin-server

EXPOSE 1088 1750

ADD ./config.sh /config.sh

ENTRYPOINT ["/config.sh"]

