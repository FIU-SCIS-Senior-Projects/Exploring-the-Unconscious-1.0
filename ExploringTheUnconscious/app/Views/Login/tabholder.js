import React, { Component } from 'react';

import {
	View,
	Text,
} from 'react-native'
import {TabNavigator} from 'react-navigation';
import {LoginView} from './loginView.js';
import {RegisterView} from '../Registration/registrationView.js';

export const tabHolder = TabNavigator({
	Login: { screen: LoginView},
	Register: { screen: RegisterView },
}, {
	tabBarOptions: {
	    style: {
		    backgroundColor: '#655355'
	    },
	    labelStyle: {
		    fontSize: 20,
	    	    color: '#93b2af'
	    }
	},
        swipeEnabled: true,
});

