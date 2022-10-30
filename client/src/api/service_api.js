import axios from 'axios';

const {
    REACT_APP_COMMON_DATA_SERVICE_PORT,
    REACT_APP_AUTHENTICATION_SERVICE_PORT,
    REACT_APP_SEARCH_SUGGESTION_SERVICE_PORT,
    REACT_APP_COMMON_DATA_SERVICE_URL,
    REACT_APP_AUTHENTICATION_SERVICE_URL,
    REACT_APP_SEARCH_SUGGESTION_SERVICE_URL
} = process.env

export const authServiceAPI = axios.create({
    baseURL: REACT_APP_AUTHENTICATION_SERVICE_URL || `http://localhost:${REACT_APP_AUTHENTICATION_SERVICE_PORT}`
   // baseURL: process.env.REACT_APP_GATEWAY_URL
})

export const commonServiceAPI = axios.create({
    //baseURL: REACT_APP_COMMON_DATA_SERVICE_URL || `http://localhost:${REACT_APP_COMMON_DATA_SERVICE_PORT}`
    baseURL: REACT_APP_COMMON_DATA_SERVICE_URL || `http://localhost:4000`
     //baseURL: process.env.REACT_APP_GATEWAY_URL
})

export const searchSuggestionServiceAPI = axios.create({
    baseURL: REACT_APP_SEARCH_SUGGESTION_SERVICE_URL || `http://localhost:${REACT_APP_SEARCH_SUGGESTION_SERVICE_PORT}`
    //baseURL: `process.env.REACT_APP_GATEWAY_URL`
})