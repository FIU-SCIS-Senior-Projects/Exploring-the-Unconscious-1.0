import React, { Component } from 'react';
import {
	View,
	Text,
	Image,
	TextInput,
	ScrollView,
	TouchableOpacity,
	Button
} from 'react-native';
import styles from './style.js';
import * as firebase from 'firebase';
export class RegisterView extends React.Component {
	constructor(props) {
		super(props);
		this.state ={
			firstName: '',
			lastName: '',
			email: '',
			password: '',
			verification: '',
			isLoggedIn: 'false',
		};
	}
	submitRegistration = ({email, password, firstName, lastName}) => {
	      console.log(email);
	      console.log(password); 
	      firebase.auth().createUserWithEmailAndPassword(email, password)
	      .catch(error => console.log('registered')).then(() => {
		      firebase.auth().signInWithEmailAndPassword(email,password).catch(error => 
			      console.log('user logged on')).then(() => {
		     				 firebase.auth().onAuthStateChanged(function(user) {
		     			 			if(user) {
			     						 console.log(user);
		      							 firebase.database().ref().child("users").child(user.uid).set({
									 displayName: firstName + ' ' + lastName,
								         email: email,
									 questions: []
		     	 						});
		     	 					}
			     					 else{

		     		 					}
							});

     					});
		      });
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


	render() {
		return(
			<Image source={ require('../../Assets/gradient.jpg')}
			style= {styles.container}>
			<ScrollView>
				<TextInput
					style={styles.firstTextContainer}
					placeholder='First Name'
					onChangeText = {(firstName) => this.setState({firstName})}/>
				<TextInput
					style={styles.textContainer}
					placeholder='Last Name'
					onChangeText = {(lastName) => this.setState({lastName})}/>
				<TextInput
					style={styles.textContainer}
					placeholder='Email'
					onChangeText = {(email) => this.setState({email})}/>
				<TextInput
					secureTextEntry={true}
					style={styles.textContainer}
					placeholder='Password'
					onChangeText = {(password) => this.setState({password})}/>
				<TextInput
					secureTextEntry={true}
					style={styles.textContainer}
					placeholder='Verify Password'
					onChangeText = {(verification) => this.setState({verification})}/>
				<TouchableOpacity
					style={styles.button}
					onPress={() =>
						this.submitRegistration(this.state)}>
				<Text style={styles.buttonText}> Register </Text>
				</TouchableOpacity>
			</ScrollView>
			</Image>
		);
	}
}

