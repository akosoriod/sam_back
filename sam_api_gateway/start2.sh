./rancher-compose --SAM sam-api-gateway \
--url http://192.168.99.100:8080/v1/projects/1a5 \
--access-key D5E37730F555325B30D1 \
--secret-key 6jKR5KqP9NsEscjsZUMg5ETZwaJ5ABpLeTvofT7C \
-f docker-compose.yml \
--verbose up \
-d --force-upgrade \
--confirm-upgrade
