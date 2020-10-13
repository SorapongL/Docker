cd C:\Users\james\eclipse-workspace\dockerProject
docker-compose -f docker-compose.yml up -d
:: docker-compose up -d --scale chrome=3 --scale firefox=1 --no-recreate