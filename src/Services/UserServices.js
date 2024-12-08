import axios from 'axios';
const TOUR_API = "http://localhost:8080/safari/user";

class UserService {
    createUser(user) {
        return axios.post(TOUR_API + '/signUp', user);
    }
}

export default new UserService;
