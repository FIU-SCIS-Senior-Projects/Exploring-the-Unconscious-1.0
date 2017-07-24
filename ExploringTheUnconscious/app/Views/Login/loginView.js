import React, { Component } from 'react';
import {
	View,
	Text,
	Alert,
	TextInput,
	TouchableOpacity,
	Image,
	Button
} from 'react-native';

import firebase from 'firebase'
import { TabNavigator } from 'react-navigation';
import { connect } from 'react-redux';
import { bindActionCreators } from 'redux';
import * as ActionCreators from '../../Actions/authActions.js';
import styles from './styles.js';
import {ExploreView} from '../Explore/exploreView.js';
import {RegisterView} from '../Registration/registrationView.js';

export class LoginView extends React.Component {
	constructor(props) {
		super(props);
		this.state = {
			email: '',
			password: '',
		};
	}
   	static navigationOptions ={
		headerRight: <Button title="Logout" onPress={() =>
			firebase.auth().signOut().then(function() {
			console.log("signed out")
		}).catch(function(error){
			console.log(error)
		})
			} 
		></Button>
	}
	componentDidMount(){
		firebase.auth().onAuthStateChanged(firebaseUser => {
			if(firebaseUser){
				console.log(firebaseUser);
			}
			else{
				console.log("user is not logged on");
			}
		});
		console.log(this);
		console.log(ActionCreators);
	}


      submitLogin= ({email, password}) =>  {
      	           firebase.auth().signInWithEmailAndPassword(email, password)
	      	      .then(() => {this.props.navigate('Explore')})
		      .catch(error => { 
			      console.log('didnt work')
		});
      }

	render() {
		const { navigate } = this.props.navigation;
		return(
			<Image source ={require('../../Assets/gradient.jpg')}
			style={styles.container}>
			<View> 
			<TextInput
			style={styles.loginStyle}
			placeholder='Email'
			onChangeText = {(email) => this.setState({email})}
		           />

			<TextInput
			  secureTextEntry = {true}
			  style ={styles.passwordStyle}
			  placeholder='password'
			  onChangeText = {(password) => this.setState({password})}
			 />

			<TouchableOpacity
				style={styles.button}
				onPress={() =>
					this.submitLogin(this.state, navigate)
			}>
				<Text style={styles.buttonText}> Login </Text>
			</TouchableOpacity>
			</View>
			</Image>
		);
		}
}


function mapDispatchToProps(dispatch) {
		return {
			doLogin: function(){dispatch(ActionCreators.doLogin)}
		};
	}

//function mapStateToProps(dispatch){
//	return {email: this.state.email, password: this.state.password}
//}


export default connect(null , mapDispatchToProps)(LoginView);
