import React, { Component } from 'react';
import {
	View,
	Text,
	Image,
	TextInput,
	ScrollView,
	TouchableOpacity,
} from 'react-native';
import styles from './style.js';
import firebase from 'firebase';

export class RegisterView extends React.Component {
	constructor(props) {
		super(props);
		this.state ={
			firstName: '',
			lastName: '',
			email: '',
			password: '',
			verification: '',
		};
	}
 
	submitRegistration = ({email, password, navigate}) => {
	      console.log(email);
	      console.log(password); 
	      firebase.auth().createUserWithEmailAndPassword(email, password)
	      .catch(error => console.log('registered'));
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

