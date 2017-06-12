import React, { Component } from 'react';
import {
	View,
	Text,
	Alert,
	TextInput,
	Button,
	Image,
} from 'react-native';
import { StackNavigator } from 'react-navigation';
import {bindActionCreators} from 'redux';
import {ActionCreators} from '../Actions';
import styles from './styles.js';
export class LoginView extends React.Component {
	static navigationOptions = {
		title: 'Login',
		};
	
	constructor(props) {
		super(props);
		this.state = {
			email: '',
			password: '',
		};
	}

      submitLogin = ({email, password}) => {
	this.props.doLogin(email,password);	
      }
      submitRegistration = ({email, password}) => {
	      this.props.registerUser(email,password);
      }

	render() {
		return(
			<Image source ={require('../Assets/gradient.jpg')}
			style={styles.container}>
			<View> 
			<TextInput
			   style={styles.loginStyle}
			   placeholder='Email'
			   onTextChange = {(email) => this.setState({email})}/>

			<TextInput
			  secureTextEntry = {true}
			  style ={styles.passwordStyle}
			  placeholder='password'
			  onTextChange = {(password) => this.setState({password})}/>

			<Button
				title= 'Login'
				onPress={() => {
					this.submitLogin(this.state)
				}
			}/>
			<Button
				title= 'Register'
				onPress={() => {
					this.submitRegistration(this.state)
				}
			}/>
			</View>
			</Image>
		);
		}
}

