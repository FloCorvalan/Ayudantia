#FROM node:lts-alpine as vue-front

# install simple http server for serving static content
#RUN npm install -g http-server

# make the 'app' folder the current working directory
#WORKDIR /pruebaAyudantia/front

# copy both 'package.json' and 'package-lock.json' (if available)
#COPY package*.json ./

# install project dependencies
#RUN npm install

# copy project files and folders to the current working directory (i.e. 'app' folder)
#COPY . .

# build app for production with minification
#RUN npm run build

#EXPOSE 8080
#CMD ["npm", "run", "serve"]
#CMD ["http-server", "dist" ]


#Para nginx

#FROM nginx:latest
#COPY nginx.conf /etc/nginx/conf.d/default.conf
#WORKDIR /usr/share/nginx/html
#RUN rm -rf ./*
#COPY --from=vue-front /dist .
#EXPOSE 8080:8080

FROM node:12.2.0-alpine as build
WORKDIR /app
ENV PATH /app/node_modules/.bin:$PATH
COPY package.json /app/package.json
RUN npm install --silent
RUN npm install @vue/cli@3.7.0 -g
COPY . /app
RUN npm run build
EXPOSE 8080

# production environment
FROM nginx:1.16.0-alpine
RUN rm -rf /usr/share/nginx/html/*
COPY --from=build /app/dist /usr/share/nginx/html
RUN rm /etc/nginx/conf.d/default.conf
COPY nginx.conf /etc/nginx/conf.d
EXPOSE 8080:8080
CMD ["nginx", "-g", "daemon off;"]